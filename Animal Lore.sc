sub anatomy() ; Anatomy
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(400)
   wend
   While UO.SkillVal( 'Anatomy' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Anatomy')
      Wait(5000)
   wend
end sub

sub anatomy() ; Anatomy
   uo.exec('addobject TOT')
   While uo.targeting()
      wait(100)
   wend
   While UO.SkillVal( 'Animal Lore' ) < 1046
      UO.waittargetobject('TOT')
      UO.UseSkill('Animal Lore')
      Wait(4000)
   wend
end sub