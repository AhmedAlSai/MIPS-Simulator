package architecture;
import java.math.*;
import java.util.*;

   public class Architecture {
 
    public static void main(String[] args) {
        main m = new main();
        m.setVisible(true);


//00100001000010000000000000000100  addi t0 t0 4 
//00100001001010010000000000000100  addi t1 t1 4
//00100000000100001111111111111110  addi s0  0 -2 (Extra addi for a negative value)
//00000001000010000100000000100000  add t0 t0 t0  
//00000001000010010101000000100111  nor t2 t0 t1 
//00000000000010000101000001000000  sll t2 t0 1  
//00000001001010000101100000101010  slt t3 t1 t0
//00101001000011000000000000001000  slti t4 t0 8
//00010001000010001111111111111111  beq t0 t0 -1
//00001000000000000000000000000000  j 0
//00001100000000000000000000000001  jal 1
//00000000000000000000000000001000  jr 0
//00100000000100001111111111111110  addi $s0 $zero -2
//10101110010100000000000000000000  sw $s0 0($s2)
//10001101000100100000000000000000  lw $s2 0($t0)
//10100010001100000000000000000001  sb $s0 1($s1)
//10000010001100100000000000000001  lb $s2 1($s1)
//10010010001100110000000000000001  lbu $s3 1($s1)
//10001110001101000000000000000000  lw $s4 0(s1)
    }
 
}


/*
10101110010100000000000000000000
00100000000100001111111111111110
10101110010100000000000000000000
*/
