package com.pehls.healthcare.View.TGC;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 14/11/2017.
 */

public class TGCAdapter {
    private static TextView tgc_textView;
    private static Button ok_button;
    static void IMCAdapter (View view) {
        tgc_textView = (TextView) view.findViewById(R.id.tgc_textView);
        ok_button = (Button) view.findViewById(R.id.ok_button4);
    }

    public static Button getOk_button() {
        return ok_button;
    }

    public static TextView gettgc_textView() {
        return tgc_textView;
    }
}
