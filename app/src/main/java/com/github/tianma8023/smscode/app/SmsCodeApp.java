package com.github.tianma8023.smscode.app;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import com.github.tianma8023.smscode.BuildConfig;
import com.github.tianma8023.smscode.R;
import com.github.tianma8023.smscode.constant.NotificationConst;
import com.github.tianma8023.smscode.db.DBManager;
import com.github.tianma8023.smscode.migrate.TransitionTask;
import com.github.tianma8023.smscode.utils.CrashHandler;
import com.github.tianma8023.smscode.utils.XLog;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import androidx.annotation.RequiresApi;

public class SmsCodeApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initXLog();

        initCrashHandler();

//        initUmengAnalyze();

        initBugly();

        initNotificationChannel();

        initDatabase();

        // There is no need to perform data-transition now.
        // performTransitionTask();
    }

    private void initNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // foreground service notification channel
            String channelId = NotificationConst.CHANNEL_ID_FOREGROUND_SERVICE;
            String channelName = getString(R.string.channel_name_foreground_service);
            createNotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_MIN);

            // SMS code notification channel
            channelId = NotificationConst.CHANNEL_ID_SMSCODE_NOTIFICATION;
            channelName = getString(R.string.channel_name_smscode_notification);
            createNotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createNotificationChannel(String channelId, String channelName, int importance) {
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (manager != null) {
            manager.createNotificationChannel(channel);
        }
    }

    // umeng analyze initialization
//    private void initUmengAnalyze() {
//        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "");
//        UMConfigure.setLogEnabled(BuildConfig.DEBUG);
//
//        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_DUM_NORMAL);
//        MobclickAgent.setCatchUncaughtExceptions(false);
//    }

    // tencent bugly initialization
    private void initBugly() {
        CrashReport.initCrashReport(getApplicationContext(), "333c9e49e5", BuildConfig.DEBUG);
    }

    private void initXLog() {
        XLog.init(this);
    }

    // crash handler
    private void initCrashHandler() {
        CrashHandler.init(this, null);
    }

    private void initDatabase() {
        DBManager.get(this);
    }

    // data transition task
    private void performTransitionTask() {
        Executor singlePool = Executors.newSingleThreadExecutor();
        singlePool.execute(new TransitionTask(this));
    }

}
