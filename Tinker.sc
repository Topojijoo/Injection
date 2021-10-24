sub TinkeringKingJorge()
var TK='0x1EBC' 
var Iron='0x1bef'
var Item = '0x105D'
   uo.print('Bau que vai ter os irons:')
   uo.addobject('Bau')
   while UO.Targeting()
      wait(100)
   wend
   wait(500)
   uo.automenu('Tinkering','Parts') 
   uo.automenu('Parts','springs (3 iron ingots)') 
    repeat
            If uo.count(Iron) < 10 then
               uo.findtype(Iron,"-1","Bau") 
               uo.grab('1000','finditem')
               Wait(500)
            EndIf 
            If uo.count(Item) > 50 then
               uo.findtype("Item","-1","backpack")
               uo.moveitem('finditem','all','Bau')
               wait(500) 
            EndIf
            uo.DeleteJournal() 
            uo.UseType(TK)
        repeat 
            wait(1400) 
            until uo.InJournal('You put') or uo.InJournal('You make')
            until (uo.Count(Iron)<=3)
end sub
