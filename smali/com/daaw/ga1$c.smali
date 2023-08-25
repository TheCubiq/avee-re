.class public Lcom/daaw/ga1$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ga1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:F

.field public b:Lcom/daaw/sg0;


# direct methods
.method public constructor <init>(FLcom/daaw/sg0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/ga1$c;->a:F

    iput-object p2, p0, Lcom/daaw/ga1$c;->b:Lcom/daaw/sg0;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ga1$c;)F
    .locals 0

    iget p0, p0, Lcom/daaw/ga1$c;->a:F

    return p0
.end method

.method public static synthetic b(Lcom/daaw/ga1$c;)Lcom/daaw/sg0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ga1$c;->b:Lcom/daaw/sg0;

    return-object p0
.end method
