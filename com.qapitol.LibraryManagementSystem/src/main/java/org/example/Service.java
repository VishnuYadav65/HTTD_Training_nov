package org.example;

import java.io.IOException;

public interface Service {
    public void addStudent() throws IOException;
    public void removeStudent() throws IOException;
    public void UpdateStudentDetails() throws IOException;
    public void getAllStudent() throws IOException;
    public void getStudentById() throws IOException;


}
