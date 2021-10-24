sub smelt()
   uo.addobject('container')
   while uo.targeting ()
      wait(100)
   wend
   While TRUE
      Wait(2000)
      if uo.count('0x19B9','0x0000','backpack')<5 then
         uo.findtype('0x19B9','0x0000','container')
         uo.moveitem('finditem','1','backpack')
         Wait(500)
      endif
      uo.deletejournal()
      UO.UseType('0x19B7')
      repeat
         wait(200)
      until UO.InJournal('put|smelt')
      uo.findtype('0x1BEF','0x0000','backpack')
      uo.moveitem('finditem','0','container')
   Wend
end sub