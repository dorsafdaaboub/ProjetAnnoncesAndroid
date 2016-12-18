package com.isetr.buysell.Controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.isetr.buysell.R;

//
//import android.app.ProgressDialog;
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//import com.isetr.buysell.Persistence.SQLiteHandler;
//import com.isetr.buysell.Persistence.SessionManager;
//import com.isetr.buysell.R;
//
public class InscriptionActivity extends AppCompatActivity {
//    private EditText input_password,input_conf_password,input_name,input_email,input_phone,input_adresse,input_region;
//    public String text_password,text_conf_password,text_name,text_email,text_phone,text_adresse,text_region;
//    private Button btn_inscription;
//
//    private ProgressDialog pDialog;
//    private SessionManager session;
//    private SQLiteHandler db;
//
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);}}
//
//        input_name=(EditText)findViewById(R.id.input_name);
//        input_email=(EditText)findViewById(R.id.input_email);
//        input_phone=(EditText)findViewById(R.id.input_phone);
//        input_adresse=(EditText)findViewById(R.id.input_adress);
//        input_region=(EditText)findViewById(R.id.input_region);
//        input_password=(EditText)findViewById(R.id.input_password);
//        input_conf_password=(EditText)findViewById(R.id.input_conf_password);
//
//        btn_inscription=(Button)findViewById(R.id.btn_inscription);
//
//        // Progress dialog
//        pDialog = new ProgressDialog(this);
//        pDialog.setCancelable(false);
//
//        // Session manager
//        session = new SessionManager(getApplicationContext());
//
//        // SQLite database handler
//        db = new SQLiteHandler(getApplicationContext());
//
//        // Check if user is already logged in or not
//        if (session.isLoggedIn()) {
//            // User is already logged in. Take him to main activity
//            Intent intent = new Intent(InscriptionActivity.this,
//                    HomeActivity.class);
//            startActivity(intent);
//            finish();
//        }
//
//        // Register Button Click event
//        btn_inscription.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                text_name = input_name.getText().toString().trim();
//                text_email = input_email.getText().toString().trim();
//                text_password = input_password.getText().toString().trim();
//                text_conf_password = input_conf_password.getText().toString().trim();
//                text_phone = input_phone.getText().toString().trim();
//                text_adresse = input_adresse.getText().toString().trim();
//                text_region = input_region.getText().toString().trim();
//
//                if (!text_name.isEmpty() && !text_email.isEmpty() && !text_password.isEmpty()) {
//                    registerUser(name, email, password);
//                } else {
//                    Toast.makeText(getApplicationContext(),
//                            "Please enter your details!", Toast.LENGTH_LONG)
//                            .show();
//                }
//            }
//        });
//
//        // Link to Login Screen
//        btnLinkToLogin.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),
//                        LoginActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
//
//    }
//
//    /**
//     * Function to store user in MySQL database will post params(tag, name,
//     * email, password) to register url
//     * */
//    private void registerUser(final String name, final String email,
//                              final String password) {
//        // Tag used to cancel the request
//        String tag_string_req = "req_register";
//
//        pDialog.setMessage("Registering ...");
//        showDialog();
//
//        StringRequest strReq = new StringRequest(Method.POST,
//                AppConfig.URL_REGISTER, new Response.Listener<String>() {
//
//            @Override
//            public void onResponse(String response) {
//                Log.d(TAG, "Register Response: " + response.toString());
//                hideDialog();
//
//                try {
//                    JSONObject jObj = new JSONObject(response);
//                    boolean error = jObj.getBoolean("error");
//                    if (!error) {
//                        // User successfully stored in MySQL
//                        // Now store the user in sqlite
//                        String uid = jObj.getString("uid");
//
//                        JSONObject user = jObj.getJSONObject("user");
//                        String name = user.getString("name");
//                        String email = user.getString("email");
//                        String created_at = user
//                                .getString("created_at");
//
//                        // Inserting row in users table
//                        db.addUser(name, email, uid, created_at);
//
//                        Toast.makeText(getApplicationContext(), "User successfully registered. Try login now!", Toast.LENGTH_LONG).show();
//
//                        // Launch login activity
//                        Intent intent = new Intent(
//                                RegisterActivity.this,
//                                LoginActivity.class);
//                        startActivity(intent);
//                        finish();
//                    } else {
//
//                        // Error occurred in registration. Get the error
//                        // message
//                        String errorMsg = jObj.getString("error_msg");
//                        Toast.makeText(getApplicationContext(),
//                                errorMsg, Toast.LENGTH_LONG).show();
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }, new Response.ErrorListener() {
//
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e(TAG, "Registration Error: " + error.getMessage());
//                Toast.makeText(getApplicationContext(),
//                        error.getMessage(), Toast.LENGTH_LONG).show();
//                hideDialog();
//            }
//        }) {
//
//            @Override
//            protected Map<String, String> getParams() {
//                // Posting params to register url
//                Map<String, String> params = new HashMap<String, String>();
//                params.put("name", name);
//                params.put("email", email);
//                params.put("password", password);
//
//                return params;
//            }
//
//        };
//
//        // Adding request to request queue
//        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
//    }
//
//    private void showDialog() {
//        if (!pDialog.isShowing())
//            pDialog.show();
//    }
//
//    private void hideDialog() {
//        if (pDialog.isShowing())
//            pDialog.dismiss();
//    }
//}
//
//    }
//}
