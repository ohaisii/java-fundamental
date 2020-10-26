package com.mipdevp.javafundamental.basic;

import com.mipdevp.javafundamental.basic.music.Guitar;
import com.mipdevp.javafundamental.basic.vehicle.Car;
import com.mipdevp.javafundamental.basic.vehicle.Motorcycle;
import com.mipdevp.javafundamental.basic.vehicle.TheTrain;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {

    //Type psvm and TAB to create above
    public static void main(String[] args) {

        //Type sout and TAB to create above
        System.out.println("Hai!");

        Guitar.sound();

        Motorcycle.jumlahBan();
        Car.jumlahBan();
        TheTrain.jumlahBan();

        //Library
        //Download here https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.9/commons-lang3-3.9.jar
        //Copy to folder lib and add as Library
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        //Testing Artifact
        //Click File > Project Structure > Artifact > Add > Click Main and OK > OK
        //Check on folder out, if success any folder artifact and production/your-project-folder/META-INF and open file MANIFEST.MF
        //run in terminal : java -jar out/artifacts/learn_java_jar/learn-java.jar

    }
}
