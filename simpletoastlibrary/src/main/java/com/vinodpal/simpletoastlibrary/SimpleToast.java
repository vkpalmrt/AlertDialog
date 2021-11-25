package com.vinodpal.simpletoastlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleToast extends Toast {

    public static final int SUCCESS = 1;
    public static final int ERROR = 2;
    public static final int WARNING = 3;
    public static final int INFO = 4;
    public static final int DELETE = 5;
    public static final int CONFUSING = 6;
    public static final int CUSTOM_ICON = 7;

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public SimpleToast(Context context) {
        super(context);
    }

    public static Toast createToast(Context context, CharSequence msg, int duration, int type) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.simpletoast_layout, null, false);
        TextView toastMessage = layout.findViewById(R.id.toast_message);
        LinearLayout toastLayout = layout.findViewById(R.id.toast_layout_type);
        ImageView ivToastStatusIcon = layout.findViewById(R.id.toast_status_icon);
        toastMessage.setText(msg);
        toast.setGravity(16,0,0);
        switch (type) {
            case 1:
                toastLayout.setBackgroundResource(R.drawable.success_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_check_black_24dp);
                break;
            case 2:
                toastLayout.setBackgroundResource(R.drawable.error_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_clear_black_24dp);
                break;
            case 3:
                toastLayout.setBackgroundResource(R.drawable.warning_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_pan_tool_black_24dp);
                break;
            case 4:
                toastLayout.setBackgroundResource(R.drawable.info_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_info_outline_black_24dp);
                break;
            case 5:
                toastLayout.setBackgroundResource(R.drawable.delete_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_sharp_white_delete_24);
                break;
            case 6:
                toastLayout.setBackgroundResource(R.drawable.confusing_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_refresh_black_24dp);
                break;
            case 7:
                toastLayout.setBackgroundResource(R.drawable.default_shape);
                ivToastStatusIcon.setImageResource(R.drawable.ic_refresh_black_24dp);
                break;
        }
        toast.setView(layout);
        return toast;
    }

}
