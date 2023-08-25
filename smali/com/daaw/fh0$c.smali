.class public Lcom/daaw/fh0$c;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fh0$c$a;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/fh0$c;

    invoke-direct {v0}, Lcom/daaw/fh0$c;-><init>()V

    sput-object v0, Lcom/daaw/fh0$c;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x5

    const/4 v1, 0x1

    const v2, 0x7f0800ee

    const v3, 0x7f100156

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/ch0;-><init>(IZII)V

    return-void
.end method

.method public static synthetic i()Lcom/daaw/ch0;
    .locals 1

    sget-object v0, Lcom/daaw/fh0$c;->g:Lcom/daaw/ch0;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/l0;",
            ">;)V"
        }
    .end annotation

    sget-object p2, Lcom/daaw/fh0;->b:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public e()Z
    .locals 3

    sget-object v0, Lcom/daaw/fh0;->a:Lcom/daaw/ww1;

    sget v1, Lcom/daaw/j5;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
