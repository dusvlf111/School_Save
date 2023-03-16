import turtle
t = turtle.Turtle()
t.shape("turtle")

t.penup()
t.goto(-160,0)
t.pendown()
t.circle(100)

t.penup()
t.goto(0,0)
t.pendown()
t.circle(100)

t.penup()
t.goto(160,0)
t.pendown()
t.circle(100)

t.penup()
t.goto(-80,-150)
t.pendown()
t.circle(100)

t.penup()
t.goto(80,-150)
t.pendown()
t.circle(100)


turtle.done()