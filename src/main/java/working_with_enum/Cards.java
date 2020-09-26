package working_with_enum;


public enum Cards {
    CREDIT_CARD("Credit"), DEBIT_CARD("Debit");
    private String cartType;

    private Cards(String cartType) {
        this.cartType = cartType;
    }

    public void printCard() {
        System.out.println(cartType);
    }
}

enum ProgrammingLanguages {
    JAVA, PYTHON, PHP, R
}

class CheckerLanguages {
    public void checkLanguage(ProgrammingLanguages programmingLanguages) {
        switch (programmingLanguages) {
            case JAVA:
                System.out.println("OOP");
                break;
            case PYTHON:
                System.out.println("EASINESS");
                break;
            case PHP:
                System.out.println("ONLY WEB");
                break;
            case R:
                System.out.println("Functional");
                break;
            default:
                System.out.println("nothing");
                break;
        }
    }
}

enum Kredit {

    ISTEHLAK {
        @Override
        public void gosterKreditNovunu() {
            System.out.println("Bu istehlak kreditidir");
        }

        @Override
        public void kreditinMuddeti(int year) {
            super.kreditinMuddeti(year);
        }
    },

    AVTO {
        @Override
        public void gosterKreditNovunu() {
            System.out.println("Bu avtomobil kreditidir");
        }
    },

    IPOTEKA {
        @Override
        public void gosterKreditNovunu() {
            System.out.println("Bu ipoteka kreditidir");
        }

        @Override
        public void kreditinMuddeti(int year) {
            super.kreditinMuddeti(year);
        }
    };

    public abstract void gosterKreditNovunu();

    public void kreditinMuddeti(int year) {
        System.out.println("Bu kreditin muddeti " + year + " ildir");
    }
}

class Main {
    public static void main(String[] args) {
        for (Cards cards : Cards.values()) {
            System.out.println(cards.name());
        }
        Cards.DEBIT_CARD.printCard();
        Kredit.ISTEHLAK.gosterKreditNovunu();
        Kredit.IPOTEKA.kreditinMuddeti(25);
        CheckerLanguages checkerLanguages = new CheckerLanguages();
        checkerLanguages.checkLanguage(ProgrammingLanguages.PYTHON);
    }
}
