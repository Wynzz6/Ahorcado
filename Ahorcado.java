public class  Ahorcado {
        private String palabra;
        private char[] letrasecreta;
        private int intentosmaximos;
        private int intentosrestantes;

        public Ahorcado(String[] palabras, int intentosmaximos) {
            this.palabra = palabras[(int) (Math.random() * palabras.length)];
            this.intentosmaximos = intentosmaximos;
            this.intentosrestantes = intentosmaximos;

            letrasecreta = new char[palabra.length()];
            for (int i = 0; i < letrasecreta.length; i++) {
                letrasecreta[i] = '_';
            }
        }

        public boolean adivinarLetra(char letra) {
            boolean letraadivinada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    letrasecreta[i] = letra;
                    letraadivinada = true;
                }
            }

            if (!letraadivinada) {
                intentosrestantes--;
            }

            return letraadivinada;
        }

        public boolean haTerminado() {
            return intentosrestantes == 0 || String.valueOf(letrasecreta).equals(palabra);
        }

        public char[] getLetrasSecretas() {
            return letrasecreta;
        }

        public int getIntentosRestantes() {
            return intentosrestantes;
        }

        public String getPalabra() {
            return palabra;
        }
    }

