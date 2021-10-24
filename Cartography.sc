sub Carto()
   uo.addobject('bagm')
   while uo.targeting ()
      wait(100)
   wend
   While TRUE
      Wait(500)
      if uo.count('0x14ED','0x0000','backpack')<5 then
         uo.findtype('0x14ED','0x0000','bagm')
         uo.moveitem('finditem','10','backpack')
         Wait(500)
      endif
   endif
   uo.deletejournal()
   UO.UseType('0x14ED')
   repeat
      wait(100)
   until UO.InJournal('put|fail')
   uo.findtype('0x0E34','0x0030','backpack')
   uo.moveitem('finditem','0','bagm')
Wend
end sub