package labjava;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDisplay implements IDisplayManager{
    @Override
    public void displayStudents(Student[] student) {
        try{
            FileOutputStream fos= new FileOutputStream("studenti.xml");
            XMLEncoder encoder =new XMLEncoder(fos);
            encoder.setExceptionListener(new ExceptionListener() {
                @Override
                public void exceptionThrown(Exception e) {
                    System.out.println(e);
                }
            });
            encoder.writeObject(student);
            encoder.close();
            fos.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch( IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void dispalyTeachers(Profesor[] profesor) {
        try{
            FileOutputStream fos= new FileOutputStream("profesori.xml");
            XMLEncoder encoder =new XMLEncoder(fos);
            encoder.setExceptionListener(new ExceptionListener() {
                @Override
                public void exceptionThrown(Exception e) {
                    System.out.println(e);
                }
            });
            encoder.writeObject(profesor);
            encoder.close();
            fos.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch( IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void displayCourses(Curs[] curs) {
        try{
        FileOutputStream fos= new FileOutputStream("cursuri.xml");
        XMLEncoder encoder =new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println(e);
            }
        });
        encoder.writeObject(curs);
        encoder.close();
        fos.close();

        }catch(FileNotFoundException e){
        e.printStackTrace();
        }catch( IOException e){
        e.printStackTrace();
        }
    }
}
