i m p o r t   j a v a . i o . S e r i a l i z a b l e ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   C o u n t r y   i m p l e m e n t s   S e r i a l i z a b l e {  
 	 / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
 	 p r i v a t e   S t r i n g   N a m e ;  
 	 p r i v a t e   S t r i n g   I S O 2 ;  
 	 p r i v a t e   S t r i n g   C o n t i n e n t ;  
 	 p r i v a t e   M a p < S t r i n g ,   S t r i n g >   c u r r e n t C o d e s ;  
 	 p u b l i c   C o u n t r y ( S t r i n g   n a m e ,   S t r i n g   i s o 2 ,   S t r i n g   c o n t i n e n t )   {  
 	 	 t h i s . N a m e   =   n a m e . t r i m ( ) ;    
 	 	 t h i s . I S O 2   =   i s o 2 . t r i m ( ) ;  
 	 	 t h i s . C o n t i n e n t   =   c o n t i n e n t . t r i m ( ) ;  
 	 	 c u r r e n t C o d e s   =   n e w   H a s h M a p < > ( ) ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t N a m e ( )   { r e t u r n   N a m e ; }  
 	 p u b l i c   S t r i n g   g e t I S O 2 ( )   { r e t u r n   I S O 2 ; }  
 	 p u b l i c   S t r i n g   g e t C o n t i n e n t ( )   { r e t u r n   C o n t i n e n t ; }  
 	 p u b l i c   v o i d   a d d C u r r e n t C o d e ( S t r i n g   s u b d i v i s i o n N a m e ,   S t r i n g   c u r r e n t C o d e )   {  
 	 	 i f ( s u b d i v i s i o n N a m e ! = n u l l   & &   c u r r e n t C o d e ! = n u l l )  
 	 	 	 c u r r e n t C o d e s . p u t ( s u b d i v i s i o n N a m e ,   c u r r e n t C o d e ) ;  
 	 }  
 	 p u b l i c   A r r a y L i s t < S t r i n g >   g e t C u r r e n t C o d e s ( )   {  
 	 	 A r r a y L i s t < S t r i n g >   l i s t   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 c u r r e n t C o d e s . e n t r y S e t ( )  
 	 	 	 	 	 . s t r e a m ( )  
 	 	 	 	 	 . f o r E a c h O r d e r e d ( e   - >   l i s t . a d d ( " , \ " " + e . g e t K e y ( ) + " \ " , " + e . g e t V a l u e ( ) ) ) ;  
 	 	 l i s t . s o r t ( n u l l ) ;  
 	 	 r e t u r n   l i s t ;  
 	 }  
 	 p u b l i c   i n t   g e t C u r r e n t C o d e S i z e ( )   { r e t u r n   c u r r e n t C o d e s . s i z e ( ) ; }  
 	 p u b l i c   S t r i n g   g e t I n f o ( )   {  
 	 	 r e t u r n   " \ " " + N a m e + " \ " " + " , " + C o n t i n e n t + " , " + I S O 2 ;  
 	 }  
 } 