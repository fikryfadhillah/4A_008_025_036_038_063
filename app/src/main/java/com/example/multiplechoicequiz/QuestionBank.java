package com.example.multiplechoicequiz;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Manakah tujuan utama Java?",
            "2. Manakah diantara berikut yang tidak menjelaskan tentang smartphone?",
            "3. Sebuah array berisi elemen: {1,2,3,4}. Apa jenis loop terbaik untuk mengakses semua elemen array dengan berurutan sekuensial?",
            "4. Sebuah Array dengan nilai elemen: {1,2,3,4}. Berapakah nilai elemen dengan index 2?",
            "5. If a < b hasilnya adalah FALSE, manakah yg nilainya pasti TRUE?",
            "6. Berikut yang termasuk parameter fungsi ?",
            "7. Cara membuat aplikasi Android di zaman sekarang tidak sesulit dengan ketika Android masih dalam tahap awal. Hal ini disebabkan keberadaan dari ?",
            "8. Komponen window yang berguna menggeser (ada yang menggunakan istilah menggulung) isi window ke atas/bawah maupun kiri/kanan adalah ?",
            "9. Secara umum, window akan ditampilkan untuk pertama kalinya secara ?",
            "10. Status yang selalu dipanggil oleh sistem pertama kali ketika aplikasi dijalankan serta berguna untuk mendeklarasikan sebuah Variable atau juga sarana membuat User interface (UI) adalah ?",
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Tulis sekali, jalankan dimanapun", "Satu bahasa, Satu Platform", " Java, Java dimanapun!", "Tidak ada satupun"},
            {"Terintegrasi dengan sebuah telepon selular", "Membutuhkan virtual machine untuk menjalankannya", "Sebuah perangkat genggam", "Berjalan pada native apps"},
            {"Tidak mungkin bisa sekuensial", "A do while loop", "A for loop", "A while loop"},
            {"2", "4", "3", "1"},
            {"a >= b", "a <= b", "a = b", "a > b"},
            {"Loops", "Functions", "Properties", "Conditions"},
            {"Executable andal", "Compiler yang bagus", "Interpreter yang sesuai", "Tool pengembang"},
            {"Bingkai Window", "Judul Window", "Scroll bar", "Formatting toolbar"},
            {"Fullscreen", "Semifull Screen", "1/3 Layar", "1/2 Layar"},
            {"onStart( )", "on Resume()", "onCreate(Bundle)", "onStop()"}

    };

    private String mCorrectAnswers[] = {"Tulis sekali, jalankan dimanapun", "Berjalan pada native apps", "A while loop", "3", "a > b", "Properties", "Tool pengembang", "Scroll bar", "Fullscreen", "onStart( )"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}