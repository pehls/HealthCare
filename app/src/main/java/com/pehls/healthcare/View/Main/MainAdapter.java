package com.pehls.healthcare.View.Main;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 11/11/2017.
 */

public class MainAdapter {
    private static EditText name_editText;
    private static EditText age_editText;
    private static Spinner gender_spinner;
    private static EditText weight_editText;
    private static EditText height_editText;
    private static Button save_button;

    static void MainAdapter(View view) {
        name_editText = (EditText) view.findViewById(R.id.name_editText);
        age_editText = (EditText) view.findViewById(R.id.age_editText);
        gender_spinner = (Spinner) view.findViewById(R.id.gender_spinner);
        weight_editText = (EditText) view.findViewById(R.id.weight_editText);
        height_editText = (EditText) view.findViewById(R.id.height_editText);
        save_button = (Button) view.findViewById(R.id.save_button);
    }

    public static EditText getName_editText() {
        return name_editText;
    }

    public static EditText getAge_editText() {
        return age_editText;
    }

    public static Spinner getGender_spinner() {
        return gender_spinner;
    }

    public static EditText getWeight_editText() {
        return weight_editText;
    }

    public static EditText getHeight_editText() {
        return height_editText;
    }

    public static Button getSave_button() {
        return save_button;
    }
}