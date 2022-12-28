package org.example.hashcodeAndEquals;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("heard",3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
    }
}

class Card{
    public String kind;
    public int num;

    Card(){
        this("SPADE", 1);
    }
    Card(String kind, int num){
        this.kind = kind;
        this.num = num;
    }

//    @Override
//    public String toString() {
//        return "Card{" +
//                "kind='" + kind + '\'' +
//                ", num=" + num +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (num != card.num) return false;
        return kind != null ? kind.equals(card.kind) : card.kind == null;
    }

    @Override
    public int hashCode() {
        int result = kind != null ? kind.hashCode() : 0;
        result = 31 * result + num;
        return result;
    }
}
