sub Forensic()
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
 While UO.SkillVal( 'Forensic Evaluation' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Forensic Evaluation')
      Wait(3000)
   wend
end sub