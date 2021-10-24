sub Tailor()
while uo.count('0x0F9D','0x0000')
   uo.deletejournal()
   uo.usetype('0x0F9D')
   UO.WaitTargetType('0x175D')
   uo.waitmenu('Cloth','Cloth Box')
   while not uo.injournal('You put|You toss|falhou') 
      wait(500)
   wend
wend
endsub