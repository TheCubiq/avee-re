.class public final Lcom/daaw/r1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/pq;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/r1$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/daaw/r1$a;ILandroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/r1$a;->c(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/r1;->p(Z)V

    return-void
.end method

.method public final c(ILandroid/content/Context;)Ljava/lang/String;
    .locals 0

    sparse-switch p1, :sswitch_data_0

    const p1, 0x7f100035

    goto :goto_0

    :sswitch_0
    const p1, 0x7f100037

    goto :goto_0

    :sswitch_1
    const p1, 0x7f100034

    goto :goto_0

    :sswitch_2
    const p1, 0x7f100033

    goto :goto_0

    :sswitch_3
    const p1, 0x7f100036

    goto :goto_0

    :sswitch_4
    const p1, 0x7f100031

    goto :goto_0

    :sswitch_5
    const p1, 0x7f100032

    :goto_0
    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "when (targetId) {\n      \u2026{ context.getString(it) }"

    invoke-static {p1, p2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x7f090086 -> :sswitch_5
        0x7f0900fd -> :sswitch_4
        0x7f090100 -> :sswitch_3
        0x7f090103 -> :sswitch_2
        0x7f090104 -> :sswitch_1
        0x7f090106 -> :sswitch_0
    .end sparse-switch
.end method
