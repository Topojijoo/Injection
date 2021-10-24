sub carp()  
   While TRUE
      Wait(500)
      uo.deletejournal()
      UO.UseType('0x1034')
      uo.waitmenu('Carpentry','blank scroll','Blank Scrolls','blank scroll (1 log)')
      repeat
         wait(100)
      until UO.InJournal('put|toss')
      uo.findtype('0x0E34','0x0000','backpack')
      uo.moveitem('finditem','0','bauc')
   Wend
end sub