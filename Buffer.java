public class Buffer{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Navin"); // stores names and have 16 spacces extra. Why? everytime you change data and it consumes continious memory location in your heap, and if there's no location avaiable, in this case it needs to relocate.
                                                    // to reduce this, you have a buffer.

        sb.append(" Reddy");
        sb.deleteCharAt(2);
        sb.insert(0, "Java ");

        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);

        // String str = sb.toString();
    }
}