package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
        public static void main(String[] args){

            ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");



//            UserDataProvider databaseProvider = new UserDatabaseProvider();
//            UserManager userManagerWithDB = new UserManager(databaseProvider);
            UserManager userManagerWithDB =
                    (UserManager) context.getBean("userManagerWithUserDataProvider");
            System.out.println(userManagerWithDB.getUserInfo());

//            UserDataProvider webServiceProvider = new WebServiceDataProvider();
//            UserManager userManagerWithWS = new UserManager(webServiceProvider);
            UserManager userManagerWithWS =
                    (UserManager) context.getBean("userManagerWithNewDataProvider");
                    System.out.println(userManagerWithWS.getUserInfo());

//            UserDataProvider MongoDBProvider = new NewDatabseProvider();
//            UserManager userManagerWithMongoDB = new UserManager(MongoDBProvider);
            UserManager userManagerWithMongoDB =
                    (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
            System.out.println(userManagerWithMongoDB.getUserInfo());
        }
}
