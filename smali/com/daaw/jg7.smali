.class public final Lcom/daaw/jg7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/dq7;

.field public static final b:Lcom/daaw/bf7;

.field public static final c:Lcom/daaw/ue7;

.field public static final d:Lcom/daaw/be7;

.field public static final e:Lcom/daaw/xd7;

.field public static final synthetic f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-class v0, Lcom/daaw/ef7;

    const-class v1, Lcom/daaw/ff7;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v2}, Lcom/daaw/pf7;->a(Ljava/lang/String;)Lcom/daaw/dq7;

    move-result-object v2

    sput-object v2, Lcom/daaw/jg7;->a:Lcom/daaw/dq7;

    sget-object v3, Lcom/daaw/fg7;->a:Lcom/daaw/fg7;

    const-class v4, Lcom/daaw/eg7;

    invoke-static {v3, v4, v1}, Lcom/daaw/bf7;->a(Lcom/daaw/ze7;Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/bf7;

    move-result-object v3

    sput-object v3, Lcom/daaw/jg7;->b:Lcom/daaw/bf7;

    sget-object v3, Lcom/daaw/gg7;->a:Lcom/daaw/gg7;

    invoke-static {v3, v2, v1}, Lcom/daaw/ue7;->a(Lcom/daaw/se7;Lcom/daaw/dq7;Ljava/lang/Class;)Lcom/daaw/ue7;

    move-result-object v1

    sput-object v1, Lcom/daaw/jg7;->c:Lcom/daaw/ue7;

    sget-object v1, Lcom/daaw/hg7;->a:Lcom/daaw/hg7;

    const-class v3, Lcom/daaw/tf7;

    invoke-static {v1, v3, v0}, Lcom/daaw/be7;->a(Lcom/daaw/zd7;Ljava/lang/Class;Ljava/lang/Class;)Lcom/daaw/be7;

    move-result-object v1

    sput-object v1, Lcom/daaw/jg7;->d:Lcom/daaw/be7;

    sget-object v1, Lcom/daaw/ig7;->a:Lcom/daaw/ig7;

    invoke-static {v1, v2, v0}, Lcom/daaw/xd7;->b(Lcom/daaw/sd7;Lcom/daaw/dq7;Ljava/lang/Class;)Lcom/daaw/xd7;

    move-result-object v0

    sput-object v0, Lcom/daaw/jg7;->e:Lcom/daaw/xd7;

    return-void
.end method

.method public static a()V
    .locals 2

    invoke-static {}, Lcom/daaw/qe7;->b()Lcom/daaw/qe7;

    move-result-object v0

    sget-object v1, Lcom/daaw/jg7;->b:Lcom/daaw/bf7;

    invoke-virtual {v0, v1}, Lcom/daaw/qe7;->f(Lcom/daaw/bf7;)V

    sget-object v1, Lcom/daaw/jg7;->c:Lcom/daaw/ue7;

    invoke-virtual {v0, v1}, Lcom/daaw/qe7;->e(Lcom/daaw/ue7;)V

    sget-object v1, Lcom/daaw/jg7;->d:Lcom/daaw/be7;

    invoke-virtual {v0, v1}, Lcom/daaw/qe7;->d(Lcom/daaw/be7;)V

    sget-object v1, Lcom/daaw/jg7;->e:Lcom/daaw/xd7;

    invoke-virtual {v0, v1}, Lcom/daaw/qe7;->c(Lcom/daaw/xd7;)V

    return-void
.end method
