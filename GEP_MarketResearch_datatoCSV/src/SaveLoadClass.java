i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . F i l e O u t p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . O b j e c t I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . O b j e c t O u t p u t S t r e a m ;  
  
 / / tИ���  ���|�  �|���  ��D�   ȥ�X��  ���$Ɣ�  tИ��� 
 p u b l i c   c l a s s   S a v e L o a d C l a s s   {  
 	 / / �|���  tИ���  ���   ȥ� 
 	 p u b l i c   s t a t i c   v o i d   s a v e ( O b j e c t   o )   t h r o w s   I O E x c e p t i o n   {  
 	 	 F i l e O u t p u t S t r e a m   f i l e S t r e a m   =    
 	 	 	 	 n e w   F i l e O u t p u t S t r e a m ( " C : \ \ U s e r s \ \ u s e r \ \ D e s k t o p \ \ g e p \ \ d a t a \ \ C o u n t r y I n f o . g e p " ) ;  
 	 	 O b j e c t O u t p u t S t r e a m   o s   =   n e w   O b j e c t O u t p u t S t r e a m ( f i l e S t r e a m ) ;  
 	 	 o s . w r i t e O b j e c t ( o ) ;  
 	 	 o s . c l o s e ( ) ;  
 	 }  
 	 p u b l i c   s t a t i c   O b j e c t   l o a d ( )   t h r o w s   I O E x c e p t i o n ,   C l a s s N o t F o u n d E x c e p t i o n   {  
 	 	 F i l e I n p u t S t r e a m   f i l e S t r e a m   =    
 	 	 	 	 n e w   F i l e I n p u t S t r e a m ( " C : \ \ U s e r s \ \ u s e r \ \ D e s k t o p \ \ g e p \ \ d a t a \ \ C o u n t r y I n f o . g e p " ) ;  
 	 	 O b j e c t I n p u t S t r e a m   o s   =   n e w   O b j e c t I n p u t S t r e a m ( f i l e S t r e a m ) ;  
 	 	 O b j e c t   c c c   =   o s . r e a d O b j e c t ( ) ;  
 	 	 C o u n t r y C u r r e n t C o d e   r e s u l t   =   ( C o u n t r y C u r r e n t C o d e )   c c c ;  
 	 	 o s . c l o s e ( ) ;  
 	 	 r e t u r n   r e s u l t ;  
 	 }  
 }  
 