package com.example.estudos.uteis;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by Marques on 23/02/2018.
 */

public class Permissions {

    private static String[] permissoes = {Manifest.permission.SEND_SMS};

    public static void validaPermissoes(Context context, Activity activity) {
        if (!isPermissoes(context, Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS)) {
            requestIsPermission(activity, 0, permissoes);
        }
    }

    /***
     * {@link PackageManager}
     * PackageManager.PERMISSION_GRANTED =  0 -> Tem permissão.
     * PackageManager.PERMISSION_DENIED  = -1 -> Não tem permissão.
     * @param context
     * @param permissoes
     * @return
     */
    public static boolean isPermissoes(Context context, String... permissoes) {
        for (String permissao : permissoes) {
            if (ContextCompat.checkSelfPermission(context, permissao) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    public static void requestIsPermission(Activity activity, int requestCode, String... permissoes) {
        ActivityCompat.requestPermissions(activity, permissoes, requestCode);
    }
}
