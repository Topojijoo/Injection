sub arms()
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
 While UO.SkillVal( 'Arms Lore' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Arms Lore')
      Wait(3000)
   wend
end sub