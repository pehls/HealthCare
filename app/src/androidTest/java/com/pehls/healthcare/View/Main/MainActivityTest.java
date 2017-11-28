package com.pehls.healthcare.View.Main;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.pehls.healthcare.R;

/**
 * Created by gabri on 27/11/2017.
 */

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
public MainActivityTest() {
        super(MainActivity.class);
        }
private MainActivity activity;

@Override
public void setUp() throws Exception {
        super.setUp();

        Intent intent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(intent, null, null);

        activity = getActivity();
        }

    public void testDevePossuirBotaoSave() throws Exception {
        Button save_btn = (Button) activity.findViewById(R.id.save_button);

        assertNotNull(save_btn);
    }

    public void testDevePossuirEditTextName() throws Exception {
        EditText editText = (EditText) activity.findViewById(R.id.name_editText);

        assertNotNull(editText);
    }
    public void testDevePossuirEditTextAge() throws Exception {
        EditText editText = (EditText) activity.findViewById(R.id.age_editText);

        assertNotNull(editText);
    }
    public void testDevePossuirEditTextHeight() throws Exception {
        EditText editText = (EditText) activity.findViewById(R.id.height_editText);

        assertNotNull(editText);
    }
    public void testDevePossuirEditTextWeight() throws Exception {
        EditText editText = (EditText) activity.findViewById(R.id.weight_editText);

        assertNotNull(editText);
    }
    public void testDevePossuirSpinnerGender() throws Exception {
        Spinner spinner = (Spinner) activity.findViewById(R.id.gender_spinner);

        assertNotNull(spinner);
    }

}
