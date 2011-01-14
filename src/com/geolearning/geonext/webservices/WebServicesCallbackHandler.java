
/**
 * WebServicesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package com.geolearning.geonext.webservices;

    /**
     *  WebServicesCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServicesCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServicesCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServicesCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for loadUserByExternalId method
            * override this method for handling normal response from loadUserByExternalId operation
            */
           public void receiveResultloadUserByExternalId(
                    com.geolearning.geonext.webservices.WebServicesStub.LoadUserByExternalIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadUserByExternalId operation
           */
            public void receiveErrorloadUserByExternalId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for generateUserObject method
            * override this method for handling normal response from generateUserObject operation
            */
           public void receiveResultgenerateUserObject(
                    com.geolearning.geonext.webservices.WebServicesStub.GenerateUserObjectResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from generateUserObject operation
           */
            public void receiveErrorgenerateUserObject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for userExistsByUniqueId method
            * override this method for handling normal response from userExistsByUniqueId operation
            */
           public void receiveResultuserExistsByUniqueId(
                    com.geolearning.geonext.webservices.WebServicesStub.UserExistsByUniqueIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from userExistsByUniqueId operation
           */
            public void receiveErroruserExistsByUniqueId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createUser method
            * override this method for handling normal response from createUser operation
            */
           public void receiveResultcreateUser(
                    com.geolearning.geonext.webservices.WebServicesStub.CreateUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createUser operation
           */
            public void receiveErrorcreateUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadUserByUniqueId method
            * override this method for handling normal response from loadUserByUniqueId operation
            */
           public void receiveResultloadUserByUniqueId(
                    com.geolearning.geonext.webservices.WebServicesStub.LoadUserByUniqueIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadUserByUniqueId operation
           */
            public void receiveErrorloadUserByUniqueId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for userExists method
            * override this method for handling normal response from userExists operation
            */
           public void receiveResultuserExists(
                    com.geolearning.geonext.webservices.WebServicesStub.UserExistsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from userExists operation
           */
            public void receiveErroruserExists(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for userExistsByExternalId method
            * override this method for handling normal response from userExistsByExternalId operation
            */
           public void receiveResultuserExistsByExternalId(
                    com.geolearning.geonext.webservices.WebServicesStub.UserExistsByExternalIdResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from userExistsByExternalId operation
           */
            public void receiveErroruserExistsByExternalId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loadUser method
            * override this method for handling normal response from loadUser operation
            */
           public void receiveResultloadUser(
                    com.geolearning.geonext.webservices.WebServicesStub.LoadUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loadUser operation
           */
            public void receiveErrorloadUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateUser method
            * override this method for handling normal response from updateUser operation
            */
           public void receiveResultupdateUser(
                    com.geolearning.geonext.webservices.WebServicesStub.UpdateUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateUser operation
           */
            public void receiveErrorupdateUser(java.lang.Exception e) {
            }
                


    }
    