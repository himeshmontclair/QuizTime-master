package com.example.android.quiztime;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

public class Utilities {
    public static String First_Ans;
    public static String Second_Ans;
    public static String Third_Ans;
    public static String Fourth_Ans;
    public static String Fifth_Ans;
    public static boolean Result_btn_click;
    public static int screenWidth, screenHeight;



    public static void showAlert(final Context mContext, String message) {
        final AlertDialog.Builder alert_Dialog = new AlertDialog.Builder(mContext);
        alert_Dialog.setCancelable(false);
        alert_Dialog.setTitle("Alert");
        alert_Dialog.setMessage(message);
        alert_Dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        alert_Dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert_Dialog.show();
    }

}
