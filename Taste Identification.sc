sub taste()
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
 While UO.SkillVal( 'Taste Identification' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Taste Identification')
      Wait(3000)
   wend
end sub