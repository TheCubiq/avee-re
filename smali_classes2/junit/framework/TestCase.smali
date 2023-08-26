.class public abstract Ljunit/framework/TestCase;
.super Ljunit/framework/Assert;
.source "TestCase.java"

# interfaces
.implements Ljunit/framework/Test;


# instance fields
.field private fName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljunit/framework/Assert;-><init>()V

    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljunit/framework/Assert;-><init>()V

    .line 95
    iput-object p1, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    return-void
.end method

.method public static assertEquals(BB)V
    .locals 0

    .line 339
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(BB)V

    return-void
.end method

.method public static assertEquals(CC)V
    .locals 0

    .line 354
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(CC)V

    return-void
.end method

.method public static assertEquals(DDD)V
    .locals 0

    .line 277
    invoke-static/range {p0 .. p5}, Ljunit/framework/Assert;->assertEquals(DDD)V

    return-void
.end method

.method public static assertEquals(FFF)V
    .locals 0

    .line 294
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(FFF)V

    return-void
.end method

.method public static assertEquals(II)V
    .locals 0

    .line 384
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(II)V

    return-void
.end method

.method public static assertEquals(JJ)V
    .locals 0

    .line 309
    invoke-static {p0, p1, p2, p3}, Ljunit/framework/Assert;->assertEquals(JJ)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 246
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;BB)V
    .locals 0

    .line 332
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;BB)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;CC)V
    .locals 0

    .line 347
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;CC)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;DDD)V
    .locals 0

    .line 269
    invoke-static/range {p0 .. p6}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;DDD)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;FFF)V
    .locals 0

    .line 286
    invoke-static {p0, p1, p2, p3}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;FFF)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;II)V
    .locals 0

    .line 377
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;II)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;JJ)V
    .locals 0

    .line 302
    invoke-static {p0, p1, p2, p3, p4}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 238
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 260
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 253
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;SS)V
    .locals 0

    .line 362
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;SS)V

    return-void
.end method

.method public static assertEquals(Ljava/lang/String;ZZ)V
    .locals 0

    .line 317
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static assertEquals(SS)V
    .locals 0

    .line 369
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(SS)V

    return-void
.end method

.method public static assertEquals(ZZ)V
    .locals 0

    .line 324
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(ZZ)V

    return-void
.end method

.method public static assertFalse(Ljava/lang/String;Z)V
    .locals 0

    .line 208
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertFalse(Ljava/lang/String;Z)V

    return-void
.end method

.method public static assertFalse(Z)V
    .locals 0

    .line 216
    invoke-static {p0}, Ljunit/framework/Assert;->assertFalse(Z)V

    return-void
.end method

.method public static assertNotNull(Ljava/lang/Object;)V
    .locals 0

    .line 391
    invoke-static {p0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    return-void
.end method

.method public static assertNotNull(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 399
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertNotSame(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 451
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertNotSame(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertNotSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 443
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertNotSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertNull(Ljava/lang/Object;)V
    .locals 0

    .line 410
    invoke-static {p0}, Ljunit/framework/Assert;->assertNull(Ljava/lang/Object;)V

    return-void
.end method

.method public static assertNull(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 418
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertNull(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertSame(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 434
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertSame(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 426
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->assertSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static assertTrue(Ljava/lang/String;Z)V
    .locals 0

    .line 192
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertTrue(Ljava/lang/String;Z)V

    return-void
.end method

.method public static assertTrue(Z)V
    .locals 0

    .line 200
    invoke-static {p0}, Ljunit/framework/Assert;->assertTrue(Z)V

    return-void
.end method

.method public static fail()V
    .locals 0

    .line 230
    invoke-static {}, Ljunit/framework/Assert;->fail()V

    return-void
.end method

.method public static fail(Ljava/lang/String;)V
    .locals 0

    .line 223
    invoke-static {p0}, Ljunit/framework/Assert;->fail(Ljava/lang/String;)V

    return-void
.end method

.method public static failNotEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 463
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->failNotEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static failNotSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 459
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->failNotSame(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static failSame(Ljava/lang/String;)V
    .locals 0

    .line 455
    invoke-static {p0}, Ljunit/framework/Assert;->failSame(Ljava/lang/String;)V

    return-void
.end method

.method public static format(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 467
    invoke-static {p0, p1, p2}, Ljunit/framework/Assert;->format(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public countTestCases()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected createResult()Ljunit/framework/TestResult;
    .locals 1

    .line 111
    new-instance v0, Ljunit/framework/TestResult;

    invoke-direct {v0}, Ljunit/framework/TestResult;-><init>()V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 498
    iget-object v0, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    return-object v0
.end method

.method public run()Ljunit/framework/TestResult;
    .locals 1

    .line 121
    invoke-virtual {p0}, Ljunit/framework/TestCase;->createResult()Ljunit/framework/TestResult;

    move-result-object v0

    .line 122
    invoke-virtual {p0, v0}, Ljunit/framework/TestCase;->run(Ljunit/framework/TestResult;)V

    return-object v0
.end method

.method public run(Ljunit/framework/TestResult;)V
    .locals 0

    .line 130
    invoke-virtual {p1, p0}, Ljunit/framework/TestResult;->run(Ljunit/framework/TestCase;)V

    return-void
.end method

.method public runBare()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 140
    invoke-virtual {p0}, Ljunit/framework/TestCase;->setUp()V

    .line 142
    :try_start_0
    invoke-virtual {p0}, Ljunit/framework/TestCase;->runTest()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 147
    :try_start_1
    invoke-virtual {p0}, Ljunit/framework/TestCase;->tearDown()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Ljunit/framework/TestCase;->tearDown()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    nop

    :goto_0
    if-nez v0, :cond_0

    return-void

    .line 152
    :cond_0
    throw v0
.end method

.method protected runTest()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-string v0, "Method \""

    .line 161
    iget-object v1, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    const-string v2, "TestCase.fName cannot be null"

    invoke-static {v2, v1}, Ljunit/framework/TestCase;->assertNotNull(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 168
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    move-object v4, v1

    check-cast v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 170
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\" not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljunit/framework/TestCase;->fail(Ljava/lang/String;)V

    .line 172
    :goto_0
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 173
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" should be public"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljunit/framework/TestCase;->fail(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 177
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 183
    throw v0

    :catch_2
    move-exception v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 180
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 507
    iput-object p1, p0, Ljunit/framework/TestCase;->fName:Ljava/lang/String;

    return-void
.end method

.method protected setUp()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    return-void
.end method

.method protected tearDown()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 489
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljunit/framework/TestCase;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
