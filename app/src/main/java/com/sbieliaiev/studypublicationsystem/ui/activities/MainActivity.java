package com.sbieliaiev.studypublicationsystem.ui.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.artlite.bslibrary.annotations.FindViewBy;
import com.artlite.bslibrary.helpers.validation.BSValidationHelper;
import com.artlite.bslibrary.ui.activity.BSActivity;
import com.artlite.bslibrary.ui.fonted.BSEditText;
import com.sbieliaiev.studypublicationsystem.R;

/**
 *
 * Activity which provide login
 */
public class MainActivity extends BSActivity {

    /**
     * Instance of {@link BSEditText}
     */
    @FindViewBy(id = R.id.edit_login)
    private BSEditText loginEditText;

    /**
     * Instance of {@link BSEditText}
     */
    @FindViewBy(id = R.id.edit_password)
    private BSEditText passwordEditPassword;


    /**
     * Method which provide the getting of the layout ID for the current Activity
     *
     * @return layout ID for the current Activity
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * Method which provide the action when Activity is created
     *
     * @param bundle
     */
    @Override
    protected void onCreateActivity(@Nullable Bundle bundle) {
        this.setTitle("Login");
        this.setOnClickListeners(R.id.button_register,
                R.id.button_forgot_password,
                R.id.button_login);
    }

    /**
     * Method which provide the action when Activity is created (post creation)
     * Use it if you create any callback inside the activity like
     * <b>final |CallbackType| callback = new |CallbackType|</b>
     *
     * @param bundle
     */
    @Override
    protected void onActivityPostCreation(@Nullable Bundle bundle) {

    }


    /**
     * Method which provide the starting of the home activity
     * @see HomeActivity
     */
    protected void startHomeActivity (){
        this.startActivity(HomeActivity.class, true);
    }

    /**
     * Overriden method for the OnClickListener
     *
     * @param v current view
     */
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id ==  R.id.button_login){
            if (this.validateFields()) {
                this.startHomeActivity();
            }

        } else if (id == R.id.button_register) {
            // TODO: 2019-08-04
        } else if (id == R.id.button_forgot_password) {
            // TODO: 2019-08-04
        }
        //super.onClick(v);
    }

    /**
     * Method which provide us to validate fields
     * @return result
     */
    protected boolean validateFields() {
        if (this.loginEditText.getText().toString().isEmpty()) {
            this.loginEditText.setError(getString(R.string.text_required_field));
            return false;
        }
        if (!BSValidationHelper.validateEmail(this.loginEditText.getText().toString())) {
            this.loginEditText.setError(getString(R.string.text_invalid_email));
            return false;
        }
        if (this.passwordEditPassword.getText().toString().isEmpty()) {
            this.passwordEditPassword.setError(getString(R.string.text_required_field));
            return false;
        }


        return true;
    }
}
