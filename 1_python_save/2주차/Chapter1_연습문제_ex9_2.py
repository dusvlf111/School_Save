import turtle
t = turtle.Turtle()
t.shape("turtle")

tx = -160, 0, 160 , -80, 80
ty = 0, 0, 0 , -150, -150

tzip = list(zip(tx, ty))

for i in range(len(tzip)):
    t.penup()
    t.goto(tzip[i])
    t.pendown()
    t.circle(100)

turtle.done()