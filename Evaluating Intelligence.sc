sub Evaluating()
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
   While UO.SkillVal( 'Evaluating Intelligence' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Evaluating Intelligence')
      Wait(3000)
   wend
end sub