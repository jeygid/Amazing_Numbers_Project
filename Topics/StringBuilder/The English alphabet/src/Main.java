class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder sb = new StringBuilder();

        for (int i = 65; i <= 90; i++) {
            sb.append((char) i);
            if (i != 90) sb.append(" ");
        }

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}