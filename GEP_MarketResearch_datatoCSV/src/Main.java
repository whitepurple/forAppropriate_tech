i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
 p u b l i c   c l a s s   M a i n   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   t h r o w s   I O E x c e p t i o n ,   C l a s s N o t F o u n d E x c e p t i o n ,   I n t e r r u p t e d E x c e p t i o n   {  
 	 	 / / C r a w l . g e t C r a w l e r ( ) . g e t W e b ( ) ;  
 	 	 / / S y s t e m . o u t . p r i n t l n ( " f i n i s h " ) ;  
 	 	 / / C r a w l . g e t C r a w l e r ( ) . r u s ( ) ;  
 	 	  
 	 	  
 	 	 / / R e n a m e F o l d e r . c l a s s i f i c a t i o n ( ) ;  
 	 	  
 	 	 / / s a v e  
 / / 	 	 C o u n t r y C u r r e n t C o d e   c c c =   n e w   C o u n t r y C u r r e n t C o d e ( ) ;  
 / / 	 	 S a v e L o a d C l a s s . s a v e ( c c c ) ;  
 	 	  
 	 	 / / l o a d  
 	 	 C o u n t r y C u r r e n t C o d e   c c c ;  
 	 	 c c c   =   ( C o u n t r y C u r r e n t C o d e )   S a v e L o a d C l a s s . l o a d ( ) ;  
 	 	  
 	 	 / / c c c . t e s t ( ) ;  
 	 	 S c a n n e r   s c a n   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 S y s t e m . o u t . p r i n t ( " S e a r c h   C o u n t r y   C u r r e n t   C o d e   : " ) ;  
 	 	 S t r i n g   s e a r c h S t r i n g   =   s c a n . n e x t ( ) ;  
 	 	 c c c . s e a r c h C o u n t r y ( s e a r c h S t r i n g ) . f o r E a c h ( S y s t e m . o u t : : p r i n t l n ) ;  
 	 	 s c a n . c l o s e ( ) ;  
 	 	  
 	 	 / / m a k e T o t a l E x c e l   m   =   n e w   m a k e T o t a l E x c e l ( ) ;  
 	 	 / / m . m a k e ( ) ;  
 	 }  
 } 