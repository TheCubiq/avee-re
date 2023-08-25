.class public Lcom/daaw/ix0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ix0$b;
    }
.end annotation


# static fields
.field public static final b:Lcom/daaw/bl0;

.field public static final c:Lcom/daaw/xx0;


# instance fields
.field public final a:Lcom/daaw/fb1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/daaw/ix0;

    invoke-static {v0}, Lcom/daaw/el0;->a(Ljava/lang/Class;)Lcom/daaw/bl0;

    move-result-object v0

    sput-object v0, Lcom/daaw/ix0;->b:Lcom/daaw/bl0;

    new-instance v0, Lcom/daaw/ix0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/ix0$b;-><init>(Lcom/daaw/ix0$a;)V

    sput-object v0, Lcom/daaw/ix0;->c:Lcom/daaw/xx0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/fb1;

    invoke-direct {v0}, Lcom/daaw/fb1;-><init>()V

    iput-object v0, p0, Lcom/daaw/ix0;->a:Lcom/daaw/fb1;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/fb1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix0;->a:Lcom/daaw/fb1;

    return-object v0
.end method
