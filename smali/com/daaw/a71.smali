.class public final synthetic Lcom/daaw/a71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# static fields
.field public static final synthetic a:Lcom/daaw/a71;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/a71;

    invoke-direct {v0}, Lcom/daaw/a71;-><init>()V

    sput-object v0, Lcom/daaw/a71;->a:Lcom/daaw/a71;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lcom/daaw/r71;->b0(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
