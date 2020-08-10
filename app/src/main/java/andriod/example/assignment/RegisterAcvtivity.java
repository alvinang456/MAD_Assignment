package andriod.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterAcvtivity extends AppCompatActivity {
    private Button CreateAccountButton;
    private EditText inputPassword;
    private EditText inputPhoneNumber;
    private EditText inputEmail;
    private EditText inputDateOfBirth;
    private RadioButton inputGenderMale, inputGenderFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acvtivity);

        CreateAccountButton = (Button) findViewById(R.id.button_register);
        EditText inputUsername = (EditText) findViewById(R.id.register_username);
        inputPassword = (EditText) findViewById(R.id.register_password);
        inputPhoneNumber = (EditText) findViewById(R.id.register_phone_number);
        inputEmail = (EditText) findViewById(R.id.register_email);
        inputDateOfBirth = (EditText) findViewById(R.id.register_birth_date);
        RadioButton inputGenderFemale = (RadioButton) findViewById(R.id.rdbtn_gender_female);
        RadioButton inputGenderMale = (RadioButton) findViewById(R.id.rdbtn_gender_male);

    }
}