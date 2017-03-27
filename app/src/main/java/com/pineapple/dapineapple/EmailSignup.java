package com.pineapple.dapineapple;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class EmailSignup extends AppCompatActivity {

    private static final String TAG = "Email Signup";
    EditText inputName;
    EditText inputEmail;
    EditText inputPassword;
    EditText confirmPassword;
    Button signUpBtn;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_signup);

        inputEmail      = (EditText) findViewById(R.id.emailInput);
        inputPassword   = (EditText) findViewById(R.id.passwordInput);
        confirmPassword = (EditText) findViewById(R.id.confirmPassword);
        signUpBtn       = (Button)   findViewById(R.id.signUpButton);

        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }

            }
        };

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSignUp();
            }
        });

        // Write parcelable class and transfer signin info
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }


    public void returnToSignIn(View view){
        Intent intent = new Intent(this, LoginActivity.class);
    }

    private void startSignUp() {

        String email = inputEmail.getText().toString();
        String password = inputPassword.getText().toString();
        String passwordConfirm = confirmPassword.getText().toString();

        if (!password.equals(passwordConfirm)){
            Toast.makeText(EmailSignup.this, "Passwords Do Not Match", Toast.LENGTH_LONG).show();
            inputPassword.setText("");
            confirmPassword.setText("");
        }
        else {
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());

                            // If sign in fails, display a message to the user. If sign in succeeds
                            // the auth state listener will be notified and logic to handle the
                            // signed in user can be handled in the listener.
                            if (!task.isSuccessful()) {
                                Toast.makeText(EmailSignup.this, R.string.auth_failed,
                                        Toast.LENGTH_SHORT).show();
                            }
                            // ...
                        }
                    });
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
