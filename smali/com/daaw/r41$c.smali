.class public final Lcom/daaw/r41$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/r41$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/mq0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/mq0<",
            "TA;TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic c:Lcom/daaw/r41;


# direct methods
.method public constructor <init>(Lcom/daaw/r41;Lcom/daaw/mq0;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mq0<",
            "TA;TT;>;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/r41$c;->c:Lcom/daaw/r41;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/r41$c;->a:Lcom/daaw/mq0;

    iput-object p3, p0, Lcom/daaw/r41$c;->b:Ljava/lang/Class;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/r41$c;)Lcom/daaw/mq0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41$c;->a:Lcom/daaw/mq0;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/r41$c;)Ljava/lang/Class;
    .locals 0

    iget-object p0, p0, Lcom/daaw/r41$c;->b:Ljava/lang/Class;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lcom/daaw/r41$c$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lcom/daaw/r41$c<",
            "TA;TT;>.a;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/r41$c$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/r41$c$a;-><init>(Lcom/daaw/r41$c;Ljava/lang/Object;)V

    return-object v0
.end method
