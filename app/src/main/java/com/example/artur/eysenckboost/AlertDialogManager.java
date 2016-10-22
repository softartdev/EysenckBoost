package com.example.artur.eysenckboost;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import static android.content.DialogInterface.BUTTON_NEUTRAL;

class AlertDialogManager {

    static void showAlertDialog(Context context, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();

        // Setting Dialog Title
        alertDialog.setTitle(R.string.answer);

        // Setting Dialog Message
        alertDialog.setMessage(message);

        // Setting OK Button
        /*alertDialog.setButton(BUTTON_NEUTRAL, context.getText(android.R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });*/
        alertDialog.setButton(context.getText(android.R.string.ok), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }
}
