package com.admin.catalogo.infrastructure.javacore.Aintroducaoclasses.test;

import com.admin.catalogo.infrastructure.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Pedro";
        professor.sexo = 'M';
        professor.idade = 12;
        System.out.println(professor.nome);
    }
}
