package andriod.example.assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Date;

public class RegisterAcvtivity extends AppCompatActivity {
    private Button CreateAccountButton;
    private EditText inputPassword;
    private EditText inputPhoneNumber;
    private EditText inputEmail;
    private EditText inputDateOfBirth;
    private RadioButton inputGenderMale, inputGenderFemale;
    private FirebaseAuth mAuth;
    private EditText inputUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acvtivity);
        mAuth= FirebaseAuth.getInstance();

        CreateAccountButton = (Button) findViewById(R.id.button_register);
         inputUsername = (EditText) findViewById(R.id.register_username);
        inputPassword = (EditText) findViewById(R.id.register_password);
        inputPhoneNumber = (EditText) findViewById(R.id.register_phone_number);
        inputEmail = (EditText) findViewById(R.id.register_email);
        inputDateOfBirth = (EditText) findViewById(R.id.register_birth_date);
        RadioButton inputGenderFemale = (RadioButton) findViewById(R.id.rdbtn_gender_female);
        RadioButton inputGenderMale = (RadioButton) findViewById(R.id.rdbtn_gender_male);



        CreateAccountButton.setOnClickListener(new View.OnClickListener() {
            final String Password = inputPassword.getText().toString();
            final String Username = inputUsername.getText().toString();
            final String PhoneNumber = inputPhoneNumber.getText().toString();
            final String Email = inputEmail.getText().toString();
            final String DateOfBirth = inputDateOfBirth.getText().toString();
            @Override
            public void onClick(View view) {
 /*               if (Username.equals("") || DateOfBirth.equals("") || PhoneNumber.equals("") || Email.equals("") || Password.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Fill In The Blank "+Password+Username+Email+PhoneNumber+DateOfBirth, Toast.LENGTH_SHORT).show();


                }else {*/
                    mAuth.createUserWithEmailAndPassword(inputEmail.getText().toString(), inputPassword.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(getApplicationContext(), "Sign Up Successfully !", Toast.LENGTH_SHORT).show();
                                    Intent moveToSignIn = new Intent(getApplicationContext(),MainActivity.class);
                                    startActivity(moveToSignIn);
                                }else{
                                    Toast.makeText(getApplicationContext(),"Error !",Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                //}
            };


        });
    }
}