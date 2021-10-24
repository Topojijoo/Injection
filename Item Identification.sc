sub item()
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
 While UO.SkillVal( 'Item Identification' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Item Identification')
      Wait(3000)
   wend
end sub