sub anatomy() ; Anatomy
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
   While UO.SkillVal( 'Anatomy' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Anatomy')
      Wait(5000)
   wend
end sub