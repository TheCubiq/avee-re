.class public final Lcom/daaw/w6;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/w6$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/daaw/uz0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/uz0$a;->p:Lcom/daaw/uz0$a;

    iput-object v0, p0, Lcom/daaw/w6;->b:Lcom/daaw/uz0$a;

    return-void
.end method

.method public static b()Lcom/daaw/w6;
    .locals 1

    new-instance v0, Lcom/daaw/w6;

    invoke-direct {v0}, Lcom/daaw/w6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/uz0;
    .locals 3

    new-instance v0, Lcom/daaw/w6$a;

    iget v1, p0, Lcom/daaw/w6;->a:I

    iget-object v2, p0, Lcom/daaw/w6;->b:Lcom/daaw/uz0$a;

    invoke-direct {v0, v1, v2}, Lcom/daaw/w6$a;-><init>(ILcom/daaw/uz0$a;)V

    return-object v0
.end method

.method public c(I)Lcom/daaw/w6;
    .locals 0

    iput p1, p0, Lcom/daaw/w6;->a:I

    return-object p0
.end method
