package org.rithy;

public class ifDemo {
    public static void main(String[] args) {
        // score = 80
        /*
            condition of grade:
            score >= 90 => 'A'
            score >= 80 => 'B'
            score >= 70 => 'C'
            score >= 60 => 'D'
            score >= 50 => 'E'
            score < 50 => 'F'
        */
        double score = 80;
        char grade = 'F';

        if(score >= 90) {
            grade  = 'A';
        } else if(score >= 80) { // score < 90 [80, 89]
            grade = 'B';
        } else if (score >= 70) { // score < 80
            grade = 'C';
        } else if (score >= 60) { // score < 70
            grade = 'D';
        } else if (score >= 50) { // score < 60
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Student is grade : " + grade);
    }
}
