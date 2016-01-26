package com.zdzyc.appbase.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.zdzyc.appbase.App;

/**
 * Created by zdzyc on 2016/1/26.
 * <p/>
 * <p/>
 * 跟App相关的辅助类
 */

public class AppUtils {

    private AppUtils() {
        /**cannot be instantiated **/
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 获取应用程序名称
     */
    public static String getAppName() {
        try {
            PackageManager packageManager = App.sContext.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    App.sContext.getPackageName(), 0);
            int labelRes = packageInfo.applicationInfo.labelRes;
            return App.sContext.getResources().getString(labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * [获取应用程序版本名称信息]
     *
     * @param App.sContext
     * @return 当前应用的版本名称
     */
    public static String getVersionName() {
        try {
            PackageManager packageManager = App.sContext.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    App.sContext.getPackageName(), 0);
            return packageInfo.versionName;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
