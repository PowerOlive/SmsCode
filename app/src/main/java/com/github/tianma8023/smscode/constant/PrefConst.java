package com.github.tianma8023.smscode.constant;


import com.github.tianma8023.smscode.BuildConfig;

/**
 * Preference相关的常量
 */
public interface PrefConst {

    String REMOTE_PREF_NAME = BuildConfig.APPLICATION_ID + "_preferences";

    String KEY_GENERAL = "pref_general";

    String ENABLE = "pref_enable";
    boolean ENABLE_DEFAULT = false;

    String LISTEN_MODE = "pref_listen_mode";
    String LISTEN_MODE_STANDARD = "listen_mode_standard";
    String LISTEN_MODE_COMPATIBLE = "listen_mode_compatible";

    String SHOW_TOAST = "pref_show_toast";
    boolean SHOW_TOAST_DEFAULT = true;
    String COPY_TO_CLIPBOARD = "pref_copy_to_clipboard";
    boolean COPY_TO_CLIPBOARD_DEFAULT = false;

    String CHOOSE_THEME = "pref_choose_theme";
    String CURRENT_THEME_INDEX = "pref_current_theme_index";
    int CURRENT_THEME_INDEX_DEFAULT = 0;

    String ENTRY_AUTO_INPUT_CODE = "pref_entry_auto_input_code";

    String EXPERIMENTAL = "pref_experimental";
    String MARK_AS_READ = "pref_mark_as_read";
    boolean MARK_AS_READ_DEFAULT = false;
    String DELETE_SMS = "pref_delete_sms";
    boolean DELETE_SMS_DEFAULT = false;
    String BLOCK_NOTIFICATION = "pref_block_notification";
    boolean BLOCK_NOTIFICATION_DEFAULT = false;

    String SHOW_CODE_NOTIFICATION = "pref_show_code_notification";
    boolean SHOW_CODE_NOTIFICATION_DEFAULT = true;
    String AUTO_CANCEL_CODE_NOTIFICATION = "pref_auto_cancel_code_notification";
    boolean AUTO_CANCEL_CODE_NOTIFICATION_DEFAULT = false;
    String NOTIFICATION_RETENTION_TIME = "pref_notification_retention_time";
    String NOTIFICATION_RETENTION_TIME_DEFAULT = "5";


    String SMSCODE_KEYWORDS = "pref_smscode_keywords";
    String SMSCODE_KEYWORDS_DEFAULT = SmsCodeConst.VERIFICATION_KEYWORDS_REGEX;
    String SMSCODE_TEST = "pref_smscode_test";
    String CODE_RULES = "pref_code_rules";

    String OTHERS = "pref_others";
    String EXCLUDE_FROM_RECENTS = "pref_exclude_from_recents";

    String ABOUT = "pref_about";
    String VERSION = "pref_version";
    String SOURCE_CODE = "pref_source_code";
    String RATING = "pref_rating";
    String GET_ALIPAY_PACKET = "pref_get_alipay_packet";
    String DONATE_BY_ALIPAY = "pref_donate_by_alipay";

    String ENABLE_AUTO_INPUT_CODE = "pref_enable_auto_input_code";
    boolean ENABLE_AUTO_INPUT_CODE_DEFAULT = false;
    String AUTO_INPUT_MODE = "pref_auto_input_mode";
    String AUTO_INPUT_MODE_DEFAULT = "";
    String AUTO_INPUT_MODE_ROOT = "auto_input_mode_root";
    String AUTO_INPUT_MODE_ACCESSIBILITY = "auto_input_mode_accessibility";

    String FOCUS_MODE = "pref_focus_mode";
    String FOCUS_MODE_AUTO = "focus_mode_auto";
    String FOCUS_MODE_MANUAL = "focus_mode_manual";

    String MANUAL_FOCUS_IF_FAILED = "pref_manual_focus_if_failed";
    boolean MANUAL_FOCUS_IF_FAILED_DEFAULT = false;

    String CLEAR_CLIPBOARD = "pref_clear_clipboard";
    boolean CLEAR_CLIPBOARD_DEFAULT = false;

    String VERBOSE_LOG_MODE = "pref_verbose_log_mode";
    boolean VERBOSE_LOG_MODE_DEFAULT = false;

    String ENABLE_CODE_RECORDS = "pref_enable_code_records";
    boolean ENABLE_CODE_RECORDS_DEFAULT = true;
    int MAX_SMS_RECORDS_COUNT_DEFAULT = 10;
    String ENTRY_CODE_RECORDS = "pref_entry_code_records";
}
