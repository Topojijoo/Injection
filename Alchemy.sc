sub Alchemy()
while uo.count('0x0F88','0x0000')
   uo.deletejournal()
   uo.usetype('0x0F88')
   uo.waitmenu('Alchemy Menu','Lesser Poison')
   while not uo.injournal('You put|You toss|falhou') 
      wait(500)
   wend
wend
endsub